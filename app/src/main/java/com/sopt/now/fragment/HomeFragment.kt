package com.sopt.now.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.sopt.now.R
import com.sopt.now.adapter.FriendAdapter
import com.sopt.now.adapter.MyProfileAdapter
import com.sopt.now.dataClass.Friend
import com.sopt.now.dataClass.MyProfile
import com.sopt.now.databinding.FragmentHomeBinding

class HomeFragment(userncikname: String) : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding
        get() = requireNotNull(_binding) {
            "바인딩 객체 생성 완료"
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myprofileAdapter = MyProfileAdapter()
        val friendAdapter = FriendAdapter()


        val concatAdapter = ConcatAdapter(myprofileAdapter, friendAdapter)


        binding.rvFriends.run {
            adapter = concatAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
        myprofileAdapter.setMyProfile(myProfile)
        friendAdapter.setFriendList(mockFriendList)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private val myProfile = listOf(
        MyProfile(
            profileImage = R.drawable.baseline_person_outline_24,
            name = userncikname,
            selfDescription = "내 프로필 소개 텍스트"
        )
    )
    val friendIcon = R.drawable.baseline_person_24

    private val mockFriendList = listOf(
        Friend(
            profileImage = friendIcon,
            name = "강문수",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "공세영",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "김명석",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "김아린",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "김언지",
            selfDescription = "34기 안드로이드 OB",
        ), Friend(
            profileImage = friendIcon,
            name = "김윤서",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "박동민",
            selfDescription = "34기 안드로이드 OB",
        ), Friend(
            profileImage = friendIcon,
            name = "박유진",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "배지현",
            selfDescription = "34기 안드로이드 OB",
        ), Friend(
            profileImage = friendIcon,
            name = "배찬우",
            selfDescription = "34기 안드로이드 OB",
        ), Friend(
            profileImage = friendIcon,
            name = "손민재",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "송혜음",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "우상욱",
            selfDescription = "34기 안드로이드 OB",
        ), Friend(
            profileImage = friendIcon,
            name = "유정현",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "윤서희",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "곽의진",
            selfDescription = "34기 안드로이드 파트장",
        ), Friend(
            profileImage = friendIcon,
            name = "이가을",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "이나경",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "이석준",
            selfDescription = "34기 안드로이드 YB",
        ),
        Friend(
            profileImage = friendIcon,
            name = "이석찬",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "이연진",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "이유빈",
            selfDescription = "34기 안드로이드 OB",
        ), Friend(
            profileImage = friendIcon,
            name = "임하늘",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "주효은",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "최준서",
            selfDescription = "34기 안드로이드 OB",
        ), Friend(
            profileImage = friendIcon,
            name = "이현진",
            selfDescription = "34기 안드로이드 YB",
        ), Friend(
            profileImage = friendIcon,
            name = "박효빈",
            selfDescription = "34기 안드로이드 YB",
        )

    )


}