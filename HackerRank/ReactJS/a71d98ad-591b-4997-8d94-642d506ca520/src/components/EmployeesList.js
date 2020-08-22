import React from 'react';

class EmployeesList extends React.Component {

  constructor(props) {
    super(props);

    this.state = {
      inputValue: '',
      revisedList: this.props.employees
    };
  }

  updateInputValue(evt) {
    let input = evt.target.value

    this.setState({
      inputValue: input,
      revisedList: this.props.employees.filter(o =>
        Object.keys(o).some(k => o[k].toLowerCase().includes(input.toLowerCase())))
    });
  }

  render() {
    const { revisedList } = this.state;
    return (
      <React.Fragment>
        <div className="controls">
          <input type="text" className="filter-input" data-testid="filter-input" value={this.state.inputValue} onChange={evt => this.updateInputValue(evt)} />
        </div>
        <ul className="employees-list">
          {revisedList.map(employee => (
            <li key={employee.name} data-testid="employee">{employee.name}</li>
          ))}
        </ul>
      </React.Fragment>
    );
  }
}

export default EmployeesList;
