function UserCard({ user }) {

    return (
        <div className="card">
            <h3>{user.name}</h3>
            <p>Email : {user.email}</p>
            <p>City : {user.address.city}</p>
        </div>
    );

}

export default UserCard;