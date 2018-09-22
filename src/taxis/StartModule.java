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

import taxis.Frames.*;

public class StartModule {
    Main main;
    
    public static void startAll() {
        startLogin();
    }
    
    private static void startLogin() {
        Login login = new Login();
        login.setVisible(true);
    }
    
    
    
}
