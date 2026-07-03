import { useState } from "react";

function Register() {

    const [form, setForm] = useState({
        name: "",
        email: "",
        password: ""
    });

    const handleChange = (event) => {

        const { name, value } = event.target;

        setForm({
            ...form,
            [name]: value
        });

    };

    const handleSubmit = (event) => {

        event.preventDefault();

        if (form.name.length < 5) {
            alert("Name should have at least 5 characters");
            return;
        }

        if (!form.email.includes("@") || !form.email.includes(".")) {
            alert("Email is not valid");
            return;
        }

        if (form.password.length < 8) {
            alert("Password should have at least 8 characters");
            return;
        }

        alert("Registration Successful!");

        setForm({
            name: "",
            email: "",
            password: ""
        });

    };

    return (

        <div className="form-container">

            <h2>Register Here!!!</h2>

            <form onSubmit={handleSubmit}>

                <label>Name</label>

                <br/>

                <input
                    type="text"
                    name="name"
                    value={form.name}
                    onChange={handleChange}
                />

                <br/><br/>

                <label>Email</label>

                <br/>

                <input
                    type="email"
                    name="email"
                    value={form.email}
                    onChange={handleChange}
                />

                <br/><br/>

                <label>Password</label>

                <br/>

                <input
                    type="password"
                    name="password"
                    value={form.password}
                    onChange={handleChange}
                />

                <br/><br/>

                <button type="submit">

                    Submit

                </button>

            </form>

        </div>

    );

}

export default Register;