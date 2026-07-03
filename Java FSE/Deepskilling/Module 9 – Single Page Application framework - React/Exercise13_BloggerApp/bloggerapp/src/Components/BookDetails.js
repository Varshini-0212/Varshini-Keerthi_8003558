function BookDetails(props){

    return(

        <div>

            {

                props.books.map(book=>

                    <div key={book.id}>

                        <h3>{book.bname}</h3>

                        <h4>{book.price}</h4>

                    </div>

                )

            }

        </div>

    );

}

export default BookDetails;