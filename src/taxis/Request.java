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
import javax.swing.JOptionPane;

/**
 *
 * @author jhonatan
 */
public class Request {
    static Connection con;
    
    public static PreparedStatement getContext(String requestType, String table) {       
        PreparedStatement Statement = null;
        String sql;
        try {
            switch(requestType) {
                case ("INSERT"):
                    switch(table) {
                        case ("LOGIN"):
                            sql = "INSERT INTO Login_Data(user, pass) VALUES (?,?)";
                            Statement = con.prepareStatement(sql);
                            break;
                        case (""):
                            sql = "";
                            Statement = con.prepareStatement(sql);
                            break;
                    }               
                    return Statement;                
                case (" "):
                    break;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Se ah detectado un problema.\n"+e.getMessage());
        }
        return Statement;
    }
}
