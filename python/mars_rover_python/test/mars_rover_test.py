import unittest

from parameterized import parameterized

from mars_rover import Rover


class MarsRoverTest(unittest.TestCase):
    @parameterized.expand([
        ('N', 'E'),
        ('E', 'S'),
        ('S', 'W'),
        ('W', 'N')
    ])
    def test_turn_right_clockwise(self, starts_facing, ends_facing):
        rover = Rover(starts_facing)
        rover = rover.go('R')
        self.assertEqual(ends_facing, rover.facing)


if __name__ == '__main__':
    unittest.main()
