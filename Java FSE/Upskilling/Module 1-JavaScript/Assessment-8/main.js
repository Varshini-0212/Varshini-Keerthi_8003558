// Event Array

const events = [

    {
        name: "Music Festival",
        category: "Music"
    },

    {
        name: "Rock Concert",
        category: "Music"
    },

    {
        name: "Food Carnival",
        category: "Food"
    }

];

// DOM Elements

const container =
document.getElementById(
    "eventContainer"
);

const filter =
document.getElementById(
    "categoryFilter"
);

const searchBox =
document.getElementById(
    "searchBox"
);

// Display Function

function displayEvents(eventList) {

    container.innerHTML = "";

    eventList.forEach(event => {

        const card =
        document.createElement("div");

        card.classList.add("card");

        card.innerHTML = `

        <h2>${event.name}</h2>

        <p>${event.category}</p>

        <button onclick="registerEvent('${event.name}')">

            Register

        </button>

        `;

        container.appendChild(card);

    });

}

// Button Event

function registerEvent(name) {

    alert(
        `Registered for ${name}`
    );

}

// onchange Event

filter.onchange = function () {

    const selected =
    filter.value;

    if(selected === "All") {

        displayEvents(events);

    }

    else {

        const filtered =
        events.filter(event =>

            event.category === selected

        );

        displayEvents(filtered);

    }

};

// keydown Event

searchBox.addEventListener(
    "keydown",
    function () {

        const searchText =
        searchBox.value.toLowerCase();

        const searchedEvents =

        events.filter(event =>

            event.name
                 .toLowerCase()
                 .includes(searchText)

        );

        displayEvents(searchedEvents);

    }
);

// Initial Display

displayEvents(events);