package cn.hcx.Test;

import java.util.List;

import com.mongodb.MongoClient;

public class MongoTest {
	public static void main(String[] args) {
		MongoClient client = new MongoClient("192.168.52.128");
		List<String> databaseNames = client.getDatabaseNames();
		for (String dbName : databaseNames) {
			System.out.println(dbName);
		}
	}
	
}
