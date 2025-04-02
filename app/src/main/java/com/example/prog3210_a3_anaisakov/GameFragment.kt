package com.example.prog3210_a3_anaisakov

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlin.random.Random

class GameFragment : Fragment() {
    // 2D array to track the status of the grid
    var grid: Array<IntArray> = arrayOf(
        intArrayOf(0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0)
    )



    fun resetGrid() {
        for (row in grid.get(0).indices) {
            for (col in grid.indices) {
                grid[row][col] = 0
            }
        }
    }

    fun setColours() {
        for (row in grid.get(0).indices) {
            for (col in grid.indices) {
                if (grid[row][col] == 0) {
                    // set square colour to white

                } else {
                    // set square colour to blue

                }
            }
        }
    }

    fun makeRound() {
        // get random grid rows
        var rows = IntArray(3) {
            Random.nextInt(1,7);
            Random.nextInt(1,7);
            Random.nextInt(1,7)
        } //.asList()
        Log.d("TAG", "row: "+rows[0])
        // get random grid columns
        var columns = IntArray(3) {
            Random.nextInt(1,7);
            Random.nextInt(1,7);
            Random.nextInt(1,7)
        } //.asList()
        Log.d("TAG", "column: "+columns[0])

        grid[rows[0]][columns[0]] = 1
        Log.d("TAG", "grid: "+grid.get(rows[0]).get(columns[0]))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        makeRound()
        return inflater.inflate(R.layout.fragment_game, container, false)
    }
}