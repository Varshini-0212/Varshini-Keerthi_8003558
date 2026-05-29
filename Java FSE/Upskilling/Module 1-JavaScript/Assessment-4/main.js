// Event Array

const events = [];

// Add Event Function

function addEvent(name, category) {

    events.push({

        name: name,

        category: category

    });

}

// Register User Function

function registerUser(eventName) {

    console.log(

        `User Registered for ${eventName}`

    );

}

// Filter Events Function

function filterEventsByCategory(category) {

    return events.filter(

        event => event.category === category

    );

}

// Closure Function

function registrationTracker() {

    let totalRegistrations = 0;

    return function () {

        totalRegistrations++;

        return totalRegistrations;

    };

}

// Create Closure

const trackMusicRegistration =
registrationTracker();

// Add Events

addEvent(
    "Music Festival",
    "Music"
);

addEvent(
    "Food Carnival",
    "Food"
);

addEvent(
    "Rock Concert",
    "Music"
);

// Register Users

registerUser(
    "Music Festival"
);

console.log(

    "Music Registrations: "
    + trackMusicRegistration()

);

console.log(

    "Music Registrations: "
    + trackMusicRegistration()

);

// Higher-Order Function

function searchEvents(callback) {

    return callback();

}

// Callback Function

const musicEvents = searchEvents(() =>

    filterEventsByCategory("Music")

);

// Display Results

const output =
document.getElementById("output");

musicEvents.forEach(event => {

    output.innerHTML += `

    <div class="card">

        <h2>${event.name}</h2>

        <p>${event.category}</p>

    </div>

    `;

});