import React, { Component } from "react";

class EventExamples extends Component {

    constructor(props) {
        super(props);

        this.state = {
            count: 0
        };
    }

    increment = () => {

        this.setState({
            count: this.state.count + 1
        });

    };

    decrement = () => {

        this.setState({
            count: this.state.count - 1
        });

    };

    sayHello = () => {

        alert("Hello! Welcome to React Events.");

    };

    sayWelcome = (message) => {

        alert(message);

    };

    onPress = () => {

        alert("I was clicked");

    };

    handleIncrement = () => {

        this.increment();

        this.sayHello();

    };

    render() {

        return (

            <div>

                <h1>React Events Example</h1>

                <h2>Counter : {this.state.count}</h2>

                <button onClick={this.handleIncrement}>
                    Increment
                </button>

                <button onClick={this.decrement}>
                    Decrement
                </button>

                <br /><br />

                <button
                    onClick={() => this.sayWelcome("Welcome to Cognizant React Training")}
                >
                    Say Welcome
                </button>

                <br /><br />

                <button onClick={this.onPress}>
                    Synthetic Event
                </button>

            </div>

        );

    }

}

export default EventExamples;