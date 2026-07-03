import './App.css';
import { useState } from "react";

import Guest from "./Components/Guest";
import User from "./Components/User";

function App() {

  const [loggedIn, setLoggedIn] = useState(false);

  return (

      <div className="App">

        <h1>Ticket Booking App</h1>

        {

          loggedIn

              ? <User/>

              : <Guest/>

        }

        <br/>

        {

          loggedIn

              ?

              <button onClick={() => setLoggedIn(false)}>

                Logout

              </button>

              :

              <button onClick={() => setLoggedIn(true)}>

                Login

              </button>

        }

      </div>

  );

}

export default App;