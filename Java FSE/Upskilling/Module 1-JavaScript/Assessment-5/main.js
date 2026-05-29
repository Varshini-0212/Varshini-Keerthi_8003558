// Event Class

class Event {

    constructor(name, category, seats) {

        this.name = name;

        this.category = category;

        this.seats = seats;

    }

}

// Prototype Method

Event.prototype.checkAvailability =
function () {

    if(this.seats > 0) {

        return "Seats Available";

    }

    else {

        return "No Seats Available";

    }

};

// Create Objects

const event1 =
new Event(
    "Music Festival",
    "Music",
    50
);

const event2 =
new Event(
    "Food Carnival",
    "Food",
    0
);

// Display Area

const output =
document.getElementById("output");

// Display Event Details

[event1, event2].forEach(event => {

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

        <p>
            ${event.checkAvailability()}
        </p>

    </div>

    `;

});

// Object.entries()

console.log(
    "Event 1 Details:"
);

Object.entries(event1).forEach(([key, value]) => {

    console.log(
        `${key}: ${value}`
    );

});