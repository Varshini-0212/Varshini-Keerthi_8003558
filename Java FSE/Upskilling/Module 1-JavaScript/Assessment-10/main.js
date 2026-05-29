// Event List

const events = [

    {
        name: "Music Festival",
        category: "Music",
        seats: 50
    },

    {
        name: "Food Carnival",
        category: "Food",
        seats: 30
    }

];

// Default Parameter Function

function showEvent(
    eventName = "Unknown Event"
) {

    console.log(
        `Event Name: ${eventName}`
    );

}

// Function Call

showEvent(
    "Music Festival"
);

// Destructuring

events.forEach(event => {

    const {
        name,
        category,
        seats
    } = event;

    console.log(
        name,
        category,
        seats
    );

});

// Spread Operator

const clonedEvents =

[...events];

// Filter Example

const musicEvents =

clonedEvents.filter(event =>

    event.category === "Music"

);

// Display Area

const output =

document.getElementById(
    "output"
);

// Display Events

musicEvents.forEach(event => {

    output.innerHTML += `

    <div class="card">

        <h2>${event.name}</h2>

        <p>
            Category:
            ${event.category}
        </p>

        <p>
            Seats:
            ${event.seats}
        </p>

    </div>

    `;

});