// Event Array

const events = [];

// Add Events Using push()

events.push({

    name: "Music Festival",

    category: "Music"

});

events.push({

    name: "Workshop on Baking",

    category: "Workshop"

});

events.push({

    name: "Rock Concert",

    category: "Music"

});

// Filter Music Events

const musicEvents =

events.filter(

    event => event.category === "Music"

);

// Format Event Cards Using map()

const formattedEvents =

musicEvents.map(event =>

    `Event: ${event.name}`

);

// Display Area

const output =

document.getElementById("output");

// Display Events

formattedEvents.forEach(event => {

    output.innerHTML += `

    <div class="card">

        <h2>${event}</h2>

    </div>

    `;

});

// Console Output

console.log(
    formattedEvents
);