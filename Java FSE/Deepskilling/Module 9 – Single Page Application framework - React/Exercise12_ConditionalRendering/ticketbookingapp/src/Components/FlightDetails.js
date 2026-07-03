function FlightDetails() {

    return (

        <table border="1" cellPadding="10">

            <thead>

            <tr>

                <th>Flight</th>
                <th>From</th>
                <th>To</th>
                <th>Fare</th>

            </tr>

            </thead>

            <tbody>

            <tr>

                <td>AI101</td>
                <td>Hyderabad</td>
                <td>Delhi</td>
                <td>₹4500</td>

            </tr>

            <tr>

                <td>AI202</td>
                <td>Hyderabad</td>
                <td>Mumbai</td>
                <td>₹3500</td>

            </tr>

            <tr>

                <td>AI303</td>
                <td>Hyderabad</td>
                <td>Chennai</td>
                <td>₹2800</td>

            </tr>

            </tbody>

        </table>

    );

}

export default FlightDetails;