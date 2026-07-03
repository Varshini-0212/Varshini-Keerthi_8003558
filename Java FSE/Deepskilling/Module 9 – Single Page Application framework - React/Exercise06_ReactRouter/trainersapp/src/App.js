import './App.css';
import { BrowserRouter, Routes, Route, Link, Navigate } from "react-router-dom";

import Home from "./Components/Home";
import TrainerList from "./Components/TrainerList";
import TrainerDetails from "./Components/TrainerDetails";

function App() {

  return (

      <BrowserRouter>

        <nav style={{ padding: "15px" }}>

          <Link to="/">Home</Link>

          {" | "}

          <Link to="/trainers">Trainers</Link>

        </nav>

        <Routes>

          <Route path="/" element={<Navigate to="/home" />} />

          <Route path="/home" element={<Home />} />

          <Route path="/trainers" element={<TrainerList />} />

          <Route path="/trainer/:id" element={<TrainerDetails />} />

        </Routes>

      </BrowserRouter>

  );

}

export default App;