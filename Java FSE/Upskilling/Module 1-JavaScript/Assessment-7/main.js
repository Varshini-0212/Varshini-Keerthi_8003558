// Event Array

const events = [

    {
        name: "Music Festival",
        seats: 5
    },

    {
        name: "Food Carnival",
        seats: 3
    }

];

// DOM Element

const container =

document.querySelector(
    "#eventContainer"
);

// Display Events

function displayEvents() {

    // Clear Existing UI

    container.innerHTML = "";

    // Loop Events

    events.forEach((event, index) => {

        // Create Card

        const card =
        document.createElement("div");

        card.classList.add("card");

        // Card Content

        card.innerHTML = `

        <h2>${event.name}</h2>

        <p>
            Available Seats:
            ${event.seats}
        </p>

        <button onclick="register(${index})">

            Register

        </button>

        <button onclick="cancel(${index})">

            Cancel

        </button>

        `;

        // Append Card

        container.appendChild(card);

    });

}

// Register Function

function register(index) {

    if(events[index].seats > 0) {

        events[index].seats--;

        displayEvents();

    }

    else {

        alert(
            "No Seats Available"
        );

    }

}

// Cancel Function

function cancel(index) {

    events[index].seats++;

    displayEvents();

}

// Initial Display

displayEvents();