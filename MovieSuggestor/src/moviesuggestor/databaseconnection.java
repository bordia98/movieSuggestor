package moviesuggestor;

import java.sql.Connection;

//interface for implementing the connection method
public interface databaseconnection {
    
        public Connection getconnected(String path,String username,String password);
}
