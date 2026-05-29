// Event List

const events = [

    {
        name: "Music Festival",
        seats: 10,
        isPast: false
    },

    {
        name: "Food Carnival",
        seats: 0,
        isPast: false
    },

    {
        name: "Old Workshop",
        seats: 5,
        isPast: true
    }

];

// Display Area

const output =
document.getElementById("events");

// Loop Through Events

events.forEach(event => {

    // Condition Check

    if(!event.isPast && event.seats > 0) {

        output.innerHTML += `

        <div class="card">

            <h2>${event.name}</h2>

            <p>
                Seats Available:
                ${event.seats}
            </p>

        </div>

        `;

    }

});

// Registration Function

function registerUser(eventName) {

    try {

        const event =
        events.find(
            e => e.name === eventName
        );

        if(!event) {

            throw "Event Not Found";

        }

        if(event.seats <= 0) {

            throw "No Seats Available";

        }

        event.seats--;

        console.log(
            `Registered for ${event.name}`
        );

        console.log(
            `Remaining Seats: ${event.seats}`
        );

    }

    catch(error) {

        console.log(
            "Error: " + error
        );

    }

}

// Test Registration

registerUser("Music Festival");

registerUser("Food Carnival");