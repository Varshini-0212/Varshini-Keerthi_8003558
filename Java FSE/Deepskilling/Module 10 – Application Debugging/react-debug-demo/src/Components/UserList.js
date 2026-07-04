import { useEffect, useState } from "react";
import { getUsers } from "../Services/ApiService";
import UserCard from "./UserCard";

function UserList() {

    const [users, setUsers] = useState([]);

    useEffect(() => {

        console.log("Fetching users...");

        getUsers()
            .then(data => {

                console.log("API Response:", data);

                setUsers(data);

            })
            .catch(error => {

                console.error(error);

            });

    }, []);

    return (

        <div>

            <h2>User List</h2>

            {

                users.map(user => (

                    <UserCard
                        key={user.id}
                        user={user}
                    />

                ))

            }

        </div>

    );

}

export default UserList;