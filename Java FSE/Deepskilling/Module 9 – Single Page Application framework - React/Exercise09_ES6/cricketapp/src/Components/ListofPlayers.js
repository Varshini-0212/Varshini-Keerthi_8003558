function ListofPlayers() {

    const players = [

        { name: "Virat", score: 95 },
        { name: "Rohit", score: 72 },
        { name: "Gill", score: 88 },
        { name: "Rahul", score: 41 },
        { name: "Hardik", score: 63 },
        { name: "Jadeja", score: 28 },
        { name: "Surya", score: 81 },
        { name: "Bumrah", score: 15 },
        { name: "Siraj", score: 10 },
        { name: "Shami", score: 25 },
        { name: "Kuldeep", score: 18 }

    ];

    const players70 = players.filter(player => player.score >= 70);

    return (

        <div>

            <h2>Players having score greater than or equal to 70</h2>

            <ul>

                {

                    players70.map((player,index)=>

                        <li key={index}>

                            {player.name} - {player.score}

                        </li>

                    )

                }

            </ul>

        </div>

    );

}

export default ListofPlayers;