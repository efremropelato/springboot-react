import React, { Component } from "react";
import logo from "./logo.svg";
import "./App.css";

class App extends Component {
  state = {};

  componentDidMount() {
    window.UserService.hello((data) => {
      this.setState({ data: data });
    });
    window.UserService.list((data) => {
      console.log(data);
      this.setState({ list: data });
    });
    window.UserService.user((data) => {
      console.log(data);
      this.setState({ user: data });
    });
    this.dadJokes();
  }

  dadJokes = () => {
    fetch("/api/dadjokes")
      .then((response) => response.text())
      .then((message) => {
        this.setState({ message: message });
      });
  };

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h3 className="App-title">{this.state.message}</h3>
          <h3 className="App-title">{this.state.data}</h3>
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload. <br/>
          {this.state.user ? this.state.user.name : ""}
        </p>
        <p>
            <ul>
                {this.state.list ? this.state.list.map((l)=>{
                    return <li>{JSON.stringify(l)}</li>
                }) : <li></li>}
            </ul>
        </p>
      </div>
    );
  }
}

export default App;
