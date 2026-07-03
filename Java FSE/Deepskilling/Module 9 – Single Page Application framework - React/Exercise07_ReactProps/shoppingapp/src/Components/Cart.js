function Cart(props) {

    return (

        <tr>

            <td>{props.itemName}</td>

            <td>₹ {props.price}</td>

        </tr>

    );

}

export default Cart;