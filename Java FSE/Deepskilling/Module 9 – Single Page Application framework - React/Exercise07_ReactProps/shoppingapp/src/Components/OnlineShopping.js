import Cart from "./Cart";

function OnlineShopping() {

    const items = [

        {
            itemName: "Laptop",
            price: 65000
        },

        {
            itemName: "Mobile",
            price: 25000
        },

        {
            itemName: "Headphones",
            price: 3500
        },

        {
            itemName: "Keyboard",
            price: 1500
        },

        {
            itemName: "Mouse",
            price: 900
        }

    ];

    return (

        <div>

            <h1>Online Shopping Cart</h1>

            <table border="1" cellPadding="10">

                <thead>

                <tr>

                    <th>Item Name</th>

                    <th>Price</th>

                </tr>

                </thead>

                <tbody>

                {

                    items.map((item,index)=>(

                        <Cart

                            key={index}

                            itemName={item.itemName}

                            price={item.price}

                        />

                    ))

                }

                </tbody>

            </table>

        </div>

    );

}

export default OnlineShopping;