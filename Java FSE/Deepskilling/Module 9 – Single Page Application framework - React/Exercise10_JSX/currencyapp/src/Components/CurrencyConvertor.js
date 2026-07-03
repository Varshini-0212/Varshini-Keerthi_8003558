import { useState } from "react";

function CurrencyConvertor() {

    const [rupees, setRupees] = useState("");
    const [euro, setEuro] = useState("");

    const handleSubmit = () => {

        const rate = 90;

        setEuro((rupees / rate).toFixed(2));

    };

    return (

        <div>

            <h1>Currency Convertor</h1>

            <input
                type="number"
                placeholder="Enter Amount in INR"
                value={rupees}
                onChange={(e) => setRupees(e.target.value)}
            />

            <br /><br />

            <button onClick={handleSubmit}>
                Convert
            </button>

            <br /><br />

            <h2>Euro : € {euro}</h2>

        </div>

    );

}

export default CurrencyConvertor;