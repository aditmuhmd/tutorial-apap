import React from "react";

import List from "components/List";
import listMovies from "movies.json";
import "./App.css";

export default class App extends React.Component {
  state = {
    favItems: [],
  };
  handleItemClick = (item) => {
    // Immutability
    const newItems = [ ... this.state.favItems];
    const newItem = { ... item};
    // Find Item index using id
    const targetInd = newItems.findIndex((it) => it.id == newItem.id);

    if (targetInd < 0) newItems.push(newItem);
    else newItems.splice(targetInd,1);

    // Trigger set state
    this.setState({ favItems: newItems});
  };
  
  deleteItemClick = () => {
    this.setState({favItems: []});
  }

  toggleFunction = () => {
    var x = document.getElementById("favorite");
    if (x.style.display == "block") {
      x.style.display = "none";
    } else {
      x.style.display = "block";
    }
  }

  render(){
    const { favItems } = this.state;
    return(
      <div className="container-fluid">
        <h1 className="text-center mt-3 mb-0">Favorites Movie App</h1>
        <p className="text-center text-secondary text-sm font-italic">
          (This is a <strong>class-based</strong> application)
        </p>
        <div className="text-center text-secondary text-sm">
          <label class="switch">
            <input type="checkbox" onClick={this.toggleFunction}/>
            <span class="slider round"></span>
          </label>
          <p>Show Favorites</p>
        </div>
        <div className="container pt-3">
          <div className="row">
            <div className="col-sm">
              <List
                title="List Movies"
                items={listMovies}
                onItemClick={this.handleItemClick}
              />
            </div>
            <div className="col-sm" id="favorite">
              <List
                title="My Favorites"
                items={favItems}
                // onItemClick={this.handleItemClick}
              />
              {favItems.length == 0 ? (
                 <span>List Favourite Tak Ade</span>
              ) : (
                <button onClick={this.deleteItemClick}>Delete</button>
              )}  
            </div>
          </div>
        </div>
      </div>
    );
  }
}