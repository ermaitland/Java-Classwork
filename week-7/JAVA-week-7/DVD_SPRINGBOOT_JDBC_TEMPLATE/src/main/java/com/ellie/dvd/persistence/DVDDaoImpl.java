package com.ellie.dvd.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ellie.dvd.entity.DVD;

@Repository("dvdDao")
public class DVDDaoImpl implements DVDDao {
	Connection connection=null;
	PreparedStatement preparedStatement;
	
	public void connectToDataBase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/DVDLib", "root", "Scoubie44");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
	
	@SuppressWarnings("finally")
	@Override
	public List<DVD> getAllRecords() {
		List<DVD> dvdList = new ArrayList<DVD>();
		try {
			connectToDataBase();
			preparedStatement = connection.prepareStatement("SELECT * FROM DVD");

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("DVD_ID");
				String title = resultSet.getString("TITLE");
				int mpaa = resultSet.getInt("MPAA_RATING");
				String directorName = resultSet.getString("DIRECTOR_NAME");
				String studio = resultSet.getString("STUDIO");
				int userRating = resultSet.getInt("USER_RATING");
				DVD dvd = new DVD(id, title, mpaa, directorName, studio, userRating);
				dvdList.add(dvd);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return dvdList;
		}

	}

	@Override
	public int addRecord(DVD dvd) {
		try {
			connectToDataBase();
			preparedStatement=connection.prepareStatement("INSERT INTO DVD VALUES(?,?,?,?,?,?)");
			preparedStatement.setInt(1, dvd.getDvdId());
			preparedStatement.setString(2, dvd.getTitle());
			preparedStatement.setInt(3, dvd.getMPAA_rating());
			preparedStatement.setString(4, dvd.getDirectorName());
			preparedStatement.setString(5, dvd.getStudio());
			preparedStatement.setInt(6, dvd.getUserRating());
			int rows = preparedStatement.executeUpdate();
			return rows;	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int deleteRecord(int id) {
		try {
			connectToDataBase();
			preparedStatement=connection.prepareStatement("DELETE FROM DVD WHERE DVD_ID=?");
			preparedStatement.setInt(1, id);
			int rows = preparedStatement.executeUpdate();
			return rows;	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int updateRecord(int id, int newRating) {
		try {
			connectToDataBase();
			String query="UPDATE DVD SET USER_RATING="+newRating+" where DVD_ID="+id;
			preparedStatement = connection.prepareStatement(query);
			
			int rows = preparedStatement.executeUpdate();
			System.out.println(rows);
			return rows;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				4.Close Connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	return 0;
	}

}
