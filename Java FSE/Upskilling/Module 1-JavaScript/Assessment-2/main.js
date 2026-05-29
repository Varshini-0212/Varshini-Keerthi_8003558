// Event Details

const eventName =
    "Music Festival";

const eventDate =
    "15 June 2026";

let availableSeats = 50;

// Display Original Details

console.log(
    `Event: ${eventName}`
);

console.log(
    `Date: ${eventDate}`
);

console.log(
    `Available Seats: ${availableSeats}`
);

// User Registration

availableSeats--;

// Updated Seats

console.log(
    `Seats After Registration: ${availableSeats}`
);

// Show On Webpage

document.getElementById("output")
.innerHTML = `

<h2>Event Details</h2>

<p><b>Event:</b> ${eventName}</p>

<p><b>Date:</b> ${eventDate}</p>

<p><b>Available Seats:</b> ${availableSeats}</p>

`;