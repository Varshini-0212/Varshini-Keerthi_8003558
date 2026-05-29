// Form Element

const form =

document.getElementById(
    "registrationForm"
);

// Error Display

const error =

document.getElementById(
    "error"
);

// Form Submit Event

form.addEventListener(
    "submit",
    function(event) {

        // Prevent Reload

        event.preventDefault();

        // Form Values

        const name =

        form.elements["username"].value;

        const email =

        form.elements["email"].value;

        const selectedEvent =

        form.elements["event"].value;

        // Validation

        if(

            name === "" ||

            email === "" ||

            selectedEvent === ""

        ) {

            error.innerText =
            "All fields are required";

            return;

        }

        // Success

        error.innerText = "";

        alert(

            `Registration Successful!

            Name: ${name}

            Email: ${email}

            Event: ${selectedEvent}`

        );

        // Reset Form

        form.reset();

    }
);