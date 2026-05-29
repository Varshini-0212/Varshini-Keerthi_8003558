// DOM Elements

const container =

document.getElementById(
    "eventContainer"
);

const loading =

document.getElementById(
    "loading"
);

// Fetch Using Promise

fetch(
    "https://jsonplaceholder.typicode.com/users"
)

.then(response =>

    response.json()

)

.then(data => {

    console.log(
        "Promise Data:",
        data
    );

})

.catch(error => {

    console.log(
        error
    );

});

// Async Await Function

async function fetchEvents() {

    try {

        // Fetch Data

        const response =

        await fetch(
            "https://jsonplaceholder.typicode.com/users"
        );

        const data =

        await response.json();

        // Hide Loading

        loading.style.display =
        "none";

        // Display Data

        data.forEach(event => {

            const card =

            document.createElement(
                "div"
            );

            card.classList.add(
                "card"
            );

            card.innerHTML = `

            <h2>${event.name}</h2>

            <p>${event.email}</p>

            `;

            container.appendChild(
                card
            );

        });

    }

    catch(error) {

        console.log(
            "Error:",
            error
        );

    }

}

// Call Function

fetchEvents();