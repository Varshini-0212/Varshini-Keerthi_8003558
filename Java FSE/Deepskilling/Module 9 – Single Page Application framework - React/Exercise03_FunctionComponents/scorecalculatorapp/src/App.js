import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {

  return (
      <div className="App">

        <CalculateScore
            name="Varshini"
            school="MRECW"
            total={480}
            goal={6}
        />

      </div>
  );
}

export default App;