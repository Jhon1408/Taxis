/*
 * Copyright 2018 jhonatan.
 *
 * you may not use this file except in compliance with the Owner.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package taxis;
import java.sql.*;
/**
 *
 * @author jhonatan
 */
public class Conexion {
    /*
        Creacion de la clase conexion para usar una base de datos
        alojada en localhost/xampp
    */
    
    public static Connection getConnection(){
        Connection con = null;
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Taxis","root","");
            return con;
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return con;
        }    
    }
}
