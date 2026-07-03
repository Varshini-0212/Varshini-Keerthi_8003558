import './App.css';
import { useState } from "react";

import ThemeContext from "./ThemeContext";
import EmployeeList from "./Components/EmployeeList";

function App() {

  const [theme] = useState("dark");

  return (

      <ThemeContext.Provider value={theme}>

        <div className="App">

          <h1>Employee Management</h1>

          <EmployeeList/>

        </div>

      </ThemeContext.Provider>

  );

}

export default App;