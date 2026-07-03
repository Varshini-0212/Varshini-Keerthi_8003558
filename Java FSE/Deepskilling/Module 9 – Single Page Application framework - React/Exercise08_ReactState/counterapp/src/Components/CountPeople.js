import React, { Component } from "react";

class CountPeople extends Component {

    constructor(props) {
        super(props);

        this.state = {
            entryCount: 0,
            exitCount: 0
        };
    }

    updateEntry = () => {

        this.setState({
            entryCount: this.state.entryCount + 1
        });

    };

    updateExit = () => {

        this.setState({
            exitCount: this.state.exitCount + 1
        });

    };

    render() {

        return (

            <div>

                <h1>Mall Entry Counter</h1>

                <h2>People Entered : {this.state.entryCount}</h2>

                <button onClick={this.updateEntry}>
                    Login
                </button>

                <br /><br />

                <h2>People Exited : {this.state.exitCount}</h2>

                <button onClick={this.updateExit}>
                    Exit
                </button>

            </div>

        );

    }

}

export default CountPeople;