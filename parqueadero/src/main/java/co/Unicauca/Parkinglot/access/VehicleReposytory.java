/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.Unicauca.Parkinglot.access;

/**
 *
 * @author kdmor
 */
public class VehicleReposytory {
     private Connection conn;

    public VehicleReposytory() {
        initDatabase();
    }

    public boolean save( newProduct) {

        try {
            //Validate product
            if (newProduct == null || newProduct.getId() < 0 || newProduct.getName().isEmpty()) {
                return false;
            }
            this.connect();

            String sql = "INSERT INTO Product ( ProductId, Name, Price ) "
                    + "VALUES ( ?, ?, ? )";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, newProduct.getId());
            pstmt.setString(2, newProduct.getName());
            pstmt.setDouble(3, newProduct.getPrice());
            pstmt.executeUpdate();
            pstmt.close();
            this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<Product> listProducts() {
        List<Product> products = new ArrayList<>();
        try {

            String sql = "SELECT ProductId, Name, Price FROM Product";
            this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Product newProduct = new Product();
                newProduct.setId(rs.getInt("ProductId"));
                
                newProduct.setName(rs.getString("Name"));
                newProduct.setPrice(rs.getDouble("Price"));

                products.add(newProduct);
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    private void initDatabase() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Product (\n"
                + "	ProductId integer PRIMARY KEY,\n"
                + "	Name text NOT NULL,\n"
                + "	Price real\n"
                + ");";

        try {
            this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void connect() {
        // Si se quiere guardar los datos a un archivo
        String url = "jdbc:sqlite:./mydatabase.db";
        
        // Guarda los datos en memoria RAM
        
        //String url = "jdbc:sqlite::memory:";

        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
