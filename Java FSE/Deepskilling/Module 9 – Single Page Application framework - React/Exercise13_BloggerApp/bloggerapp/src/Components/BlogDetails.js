function BlogDetails(props){

    return(

        <div>

            {

                props.blogs.map(blog=>

                    <div key={blog.id}>

                        <h3>{blog.title}</h3>

                        <h5>{blog.author}</h5>

                        <p>{blog.content}</p>

                    </div>

                )

            }

        </div>

    );

}

export default BlogDetails;