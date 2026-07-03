function IndianPlayers() {

    const T20players = [

        "Virat",
        "Rohit",
        "Hardik"

    ];

    const RanjiTrophy = [

        "Pujara",
        "Rahane",
        "Iyer"

    ];

    const mergedPlayers = [...T20players, ...RanjiTrophy];

    return (

        <div>

            <h2>Merged Players</h2>

            <ul>

                {

                    mergedPlayers.map((player,index)=>

                        <li key={index}>{player}</li>

                    )

                }

            </ul>

        </div>

    );

}

export default IndianPlayers;