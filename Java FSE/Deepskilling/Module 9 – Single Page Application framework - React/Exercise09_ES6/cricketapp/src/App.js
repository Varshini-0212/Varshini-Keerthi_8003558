import './App.css';

import ListofPlayers from "./Components/ListofPlayers";
import IndianPlayers from "./Components/IndianPlayers";
import OddPlayers from "./Components/OddPlayers";

function App() {

  return (

      <div className="App">

        <h1>Cricket App</h1>

        <ListofPlayers/>

        <hr/>

        <IndianPlayers/>

        <hr/>

        <OddPlayers/>

      </div>

  );

}

export default App;