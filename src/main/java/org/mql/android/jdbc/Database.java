package org.mql.android.jdbc;

import java.util.Vector;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class Database {
	private MongoDatabase db;
	//Gérer la conversion vers et depuis bson pour les POJOs
	//private CodecRegistry pojoCodecRegistr ;
	
	Database(String host, int port, String source) {
		connect(host, port, source);
	
	}

	public Database(String source) {
		connect("localhost", 27017, source);
	}
	
	private void connect(String host, int port, String source) {
		MongoClient client = new MongoClient(host, port);
		db = client.getDatabase(source);

	}
	
	public String[] find(String collectionName) {
		MongoCollection<Document> collection = db.getCollection(collectionName);
		MongoCursor<Document> cursor = collection.find().iterator();
		Vector<String> documents = new Vector<String>();
		
		try {
		    while (cursor.hasNext()) {
		        documents.add(cursor.next().toJson());
		    }
		} finally {
		    cursor.close();
		}
		
		String[] result = new String[documents.size()];
		documents.toArray(result);
		
		return result;
	}
	
	public String findOne(String collectionName, Bson filter) {
		MongoCollection<Document> collection = db.getCollection(collectionName);
		Document document = collection.find(filter).first();
		
		return document.toJson();
	}
}
