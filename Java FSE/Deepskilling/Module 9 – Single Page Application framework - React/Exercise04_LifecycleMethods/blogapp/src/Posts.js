import React, { Component } from "react";
import Post from "./Post";

class Posts extends Component {

    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    componentDidMount() {

        const posts = [
            new Post(
                1,
                "React Lifecycle",
                "componentDidMount() executes after rendering."
            ),
            new Post(
                2,
                "React Components",
                "Components make UI reusable."
            ),
            new Post(
                3,
                "React State",
                "State stores dynamic component data."
            )
        ];

        this.setState({
            posts: posts
        });
    }

    componentDidCatch(error, info) {
        alert(error);
    }

    render() {

        return (
            <div style={{padding:"20px"}}>

                <h1>Blog Posts</h1>

                {
                    this.state.posts.map(post => (
                        <div key={post.id}>
                            <h2>{post.title}</h2>
                            <p>{post.body}</p>
                            <hr />
                        </div>
                    ))
                }

            </div>
        );
    }
}

export default Posts;