import React from 'react';

class Translator extends React.Component {

  constructor(props) {
    super(props);

    this.state = {
      inputValue: '',
      output: ''
    };
  }

  updateInputValue(evt) {

    let map = this.props.translations

    let result = map.get(evt.target.value) !== undefined ? map.get(evt.target.value) : ''

    this.setState({
      inputValue: evt.target.value,
      output: result
    });
  }

  render() {

    const { inputValue, output } = this.state

    return (
      <React.Fragment>
        <div className="controls">
          <div className="input-container">
            <span>input:</span>
            <input type="text" className="text-input" data-testid="text-input" value={inputValue} onChange={evt => this.updateInputValue(evt)} />
          </div>
          <div className="input-container">
            <span>output:</span>
            <input type="text" className="text-output" data-testid="text-output" value={output} readOnly />
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default Translator;
