package com.company.repositories;

import com.company.entities.Enemy;

public class EnemyRepositories {
    private final IDB db;

    public MedicineRepositories(IDB db){
        this.db=db;
    }

    @Override
    public boolean createMedicine(Enemy enemy) {
        Connection con=null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO medication(name, price, manufacturer, healing, expiration_date) VALUES(?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, medicine.getName());
            st.setInt(2, medicine.getPrice());
            st.setString(3, medicine.getManufacturer());
            st.setString(4, medicine.getHealing());
            st.setString(5, medicine.getDate());

            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        return false;
    }

    @Override
    public Medicine getMedicine(int id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id, name, price, manufacturer, healing, expiration_date FROM medication WHERE id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            if (rs.next()){
                Medicine medicine = new Medicine(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("price"),
                        rs.getString("manufacturer"),
                        rs.getString("healing"),
                        rs.getString("expiration_date"));
                return medicine;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Medicine getMedicineByName(String name) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id, name, price, manufacturer, healing, expiration_date FROM medication WHERE name=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, name);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Medicine medicine = new Medicine(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("price"),
                        rs.getString("manufacturer"),
                        rs.getString("healing"),
                        rs.getString("expiration_date"));
                return medicine;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }


    @Override
    public List<Medicine> getAllMedicine() {
        Connection con=null;
        try {
            con = db.getConnection();
            String sql = "SELECT id, name, price, manufacturer, healing, expiration_date FROM medication";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Medicine> medication = new LinkedList<>();
            while (rs.next()) {
                Medicine medicine = new Medicine(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("price"),
                        rs.getString("manufacturer"),
                        rs.getString("healing"),
                        rs.getString("expiration_date"));
                medication.add(medicine);
            }
            return medication;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    public boolean removeMedicineByID(int id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "DELETE FROM medication WHERE id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);

            st.executeUpdate();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<Medicine> getMedicineByPrice(int price1, int price2) {
        Connection con=null;
        try {
            con = db.getConnection();
            String sql = "SELECT id, name, price, manufacturer, healing, expiration_date FROM medication WHERE price BETWEEN '" + price1 + "' AND '" + price2 + "'";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Medicine> medication = new LinkedList<>();
            while (rs.next()) {
                Medicine medicine = new Medicine(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("price"),
                        rs.getString("manufacturer"),
                        rs.getString("healing"),
                        rs.getString("expiration_date"));
                medication.add(medicine);
            }
            return medication;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Medicine getMedicineByManufacturer(String manufacturer) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id, name, price, manufacturer, healing, expiration_date FROM medication WHERE manufacturer=? AND price = (SELECT MAX(price) FROM medication);";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, manufacturer);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Medicine medicine = new Medicine(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("price"),
                        rs.getString("manufacturer"),
                        rs.getString("healing"),
                        rs.getString("expiration_date"));
                return medicine;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
