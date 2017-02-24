import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParamImpl implements definitions {

	@Override
	public void insert() throws ClassNotFoundException, SQLException {
		Connection a = connection.getConnection();
		String b = "insert into parama values(2,'DECOLD',20)";
		PreparedStatement p = a.prepareStatement(b);
		int i = p.executeUpdate();
		a.close();
	}

	@Override
	public void displayAll() throws SQLException, ClassNotFoundException {

		Connection a = connection.getConnection();
		String b = "select * from parama where order_id='1'";
		PreparedStatement p = a.prepareStatement(b);
		ResultSet i = p.executeQuery();
		while (i.next()) {
			System.out.println(+i.getInt("order_id") + " " + i.getString("name") + " " + i.getInt("price"));
		}
		a.close();
	}
	}

	
	


