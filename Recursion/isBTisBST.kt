package com.DevKitu.FirstKTApp.KotlinFiles.Recursion

class isBTisBST {

    companion object{

        data class TreeNode(val value: Int, val left: TreeNode? , val right : TreeNode? )

        @JvmStatic
        fun main(args: Array<String>) {

            val myTree = TreeNode(50,
                TreeNode(30,
                    TreeNode(10, null,
                        TreeNode(20, null, null)),
                    TreeNode(
                        40,
                        null,
                        TreeNode(48, null, null)
                    )
                ),
                TreeNode(70,
                    null,
                        TreeNode(90,
                            TreeNode(80,
                                null,
                                TreeNode(85,
                                    TreeNode(81, null, null),
                                    null)
                                ),
                            TreeNode(100, null, null)
                        )
                )
            )

            // code Start from here...

            println("Is BT BST ? : ${isBTBST(myTree, Int.MIN_VALUE, Int.MAX_VALUE)}")

        }

        fun isBTBST(root : TreeNode? , minValue : Int, maxValue : Int) : Boolean {
            if (root == null) {
                return true
            }

            if (root.value < minValue || root.value > maxValue) {
                return false
            }

            return isBTBST(root.left, minValue, root.value - 1) &&
                    isBTBST(root.right, root.value + 1, maxValue)
        }


    }
}
//
//              50
//        30         70
//    10     40            90
//      20     48     80      100
//                       85
//                    81