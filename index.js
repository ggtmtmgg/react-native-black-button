import { PropTypes } from 'react';
import { requireNativeComponent, View } from 'react-native';

var iface = {
    name: 'RNBlackButton',
    PropTypes: {
      ...View.propTypes // include the default view properties
    }
}

module.exports = requireNativeComponent('RNBlackButton', iface);
