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

import java.sql.Connection;
import javax.swing.JOptionPane;
import taxis.Frames.*;

public class StartModule {
    Main main;
    public static Connection con;
    
    public static void startAll() {
        Request.con = con;
        Login.con = con;
        startLogin();
    }
    
    private static void startLogin() {
        JOptionPane.showMessageDialog(null, "Terminado");
        Login login = new Login();        
        login.setVisible(true);
        
    }
    
    
    
}
