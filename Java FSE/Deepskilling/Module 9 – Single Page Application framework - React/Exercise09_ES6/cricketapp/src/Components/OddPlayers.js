function OddPlayers() {

    const players = [

        "Virat",
        "Rohit",
        "Gill",
        "Rahul",
        "Hardik",
        "Surya"

    ];

    const oddPlayers = players.filter((player,index)=>index%2===0);

    return (

        <div>

            <h2>Odd Players</h2>

            <ul>

                {

                    oddPlayers.map((player,index)=>

                        <li key={index}>{player}</li>

                    )

                }

            </ul>

        </div>

    );

}

export default OddPlayers;