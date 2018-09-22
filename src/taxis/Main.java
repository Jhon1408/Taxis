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

import javax.swing.JOptionPane;

public class Main {

    public void main() {
        //Calling the startModule
        JOptionPane.showMessageDialog(null, "Iniciando...");
        startMenu();
    }
    
    public void startMenu() {      
        StartModule start = new StartModule();
        start.main = this;       
        start.startAll();
    }
    
}
