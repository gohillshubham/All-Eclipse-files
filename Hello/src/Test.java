import java.sql.*;
class Test{
	public static void main(String[] args) {
		try {
			String database = "Students1.mbd";
			String url = "jdbc:odbc:Driver={Microsoft Access Driver(*.mdb)};DBQ="+database + ";DriverID =22;READONLY=true";
			Class.forName("sun.jadbc.odbc.JdbcOdbcDriver");
			Connection c = DriverManager.getConnection(url);
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("select *from BasicDetails");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}