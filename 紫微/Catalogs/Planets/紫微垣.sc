// 四辅增一(SB**)
Remove "HD 81817 b"{ParentBody "HD 81817"}
Star	"HD 81817 A"
{
	ParentBody     "HD 81817"
	Class          "K3 III"
	MassSol         4.3
	RadSol          83.8
  Luminosity      1822.9
	Teff            4140
  FeH             -0.17
  RotationPeriod  19224
	Age             0.15

	Orbit
	{
		RefPlane        "Static"
	}
}

Star	"HD 81817 B(?)"
{
	ParentBody     "HD 81817"
	Class          "DA2.8"
	Teff           20000

	Orbit // (*)
	{
		RefPlane        "Equator"
		Period          0.630147376
		SemiMajorAxis   1.19522735
		Eccentricity    0.0302626983
		Inclination     2.54957048
		AscendingNode   -171.626836
		ArgOfPericenter 270.941682
		MeanAnomaly     28.5381992
	}
}

Star	"HD 81817 Ab"
{
	ParentBody     "HD 81817"
	Class          ""
	Mass           8613.149098

	Orbit
	{
		PeriodDays      1047.1
    SemiMajorAxis   3.3
    Eccentricity    0.17
    Epoch           2449712
    ArgOfPericenter 320
    MeanAnomaly     0
	}
}

/*Star	"HD 81817 Ac(?)"
{
	ParentBody     "HD 81817"
	Class          ""
	Mass           39410.71912

	Orbit
	{
    SemiMajorAxis   2.67
	}
}*/

// 勾陈增一(PM**)
Star	"HD 216446 A"
{
	ParentBody     "HD 216446"
	Class          "K3 III"
	RadSol          25.2
  Luminosity      193
	Teff            4288
  FeH             -0.1

	BinaryOrbit
	{
		Epoch           2448622.59580785 // B1992
		Separation      343
		PositionAngle   38
	}
}

Star	"HD 216446 B"
{
	ParentBody     "HD 216446"
	Class          "T8.3 V"

	BinaryOrbit
	{
		Epoch           2448622.59580785 // B1992
		Separation      343
		PositionAngle   38
	}
}

// 勾陈增七(V**?)
Star	"HD 139669 A"
{
	ParentBody     "HD 139669"
	Class          "K5III CN0.5"
	RadSol         4.8
	Luminosity     1618
	Teff           3962
	FeH            0.18

	Orbit
	{
		RefPlane        "Equator"
		Period          0.21074543
		Eccentricity    0
		Inclination     1.96666175
		AscendingNode   0
		ArgOfPericenter -3.16434313
		MeanAnomaly     40.1502121
	}
}

Star	"HD 139669 B"
{
	ParentBody     "HD 139669"
	Class          "K5III" // spectroscopic binary with two roughly equal components.

	Orbit
	{
		RefPlane        "Equator"
		Period          0.21074543
		Eccentricity    0
		Inclination     1.96666175
		AscendingNode   0
		ArgOfPericenter 176.835657
		MeanAnomaly     40.1502121
	}
}

// 勾陈增九(PM**)
Star	"LP 23-71"
{
	ParentBody     "HD 148048"
	Class          "M4V"

	Orbit
	{
		SemiMajorAxis   6786.45
		ArgOfPericenter 120
		MeanAnomaly     0
	}
}

// 天柱增二(**)
Star	"HD 192907 A"
{
	ParentBody     "HD 192907"
	Class          "B9III"
	MassSol        3.02
	RadSol         4.45
	Luminosity     191
	Teff           10174
	FeH            -0.05
	Age            0.302

	BinaryOrbit
	{
		Epoch           2457023.16637981 // B2015
		Separation      722.7
		PositionAngle   120
	}
}

Star	"HD 192907 B"
{
	ParentBody     "HD 192907"
	Class          "A7V"
	RadSol         1.32
	Luminosity     4.05
	Teff           7119

	BinaryOrbit
	{
		Epoch           2457023.16637981 // B2015
		Separation      722.7
		PositionAngle   120
	}
}

// 女史增一(SB***)
Barycenter "女史增一/PSI1 Dra A/BD+72 804/HD 162003/HIP 86614/HR 6636/SAO 8890"
{
	ParentBody     "31 Dra"
	Orbit
	{
		Period          10000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 162003 A"
{
	ParentBody     "HD 162003"
	Class          "F5IV"
	MassSol        1.38
	RadSol         1.2 // 1.3
	Teff           6544
	FeH            -0.1

	Orbit
	{
		PeriodDays      6774
		Eccentricity    0.679
		Inclination     31
		Epoch           2450388
		ArgOfPericenter 212.6
		MeanAnomaly     0
		//SemiAmplitude   5.18
	}
}

Star	"HD 162003 B"
{
	ParentBody     "HD 162003"
	Class          ""
	MassSol        0.7
	Teff           4400

	Orbit
	{
		PeriodDays      6774
		Eccentricity    0.679
		Inclination     31
		Epoch           2450388
		ArgOfPericenter 32.6
		MeanAnomaly     0
		//SemiAmplitude   11.1
	}
}

Star "PSI1 Dra B/BD+72 805/HD 162004/HIP 86620/HR 6637/SAO 8891"
{
	ParentBody     "31 Dra"
	Class          "F8V"
	MassSol        1.19
	RadSol         1.5
	Teff           6212
	Age            0.0033

	Orbit
	{
		Period          10000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

//////////ExoPlanets//////////
Planet	"HD 162004 b"
{
	ParentBody     "HD 162004"
	Mass           486.2774214

	Orbit
	{
		SemiMajorAxis 4.43
		PeriodDays    3117
		Eccentricity  0.40
	}
}

// 尚书增一(SB**)
Remove "OME Dra A"{ParentBody "OME Dra"}
Remove "OME Dra B"{ParentBody "OME Dra"}
Star "HD 160922 A"
{
	ParentBody "HD 160922"
	Class      "F4 V"
	MassSol    1.46
	Luminosity 5.61
	Teff       6500
	FeH        0.18
	Age        1.9

	Orbit
	{
		PeriodDays      5.2797766
		Eccentricity    0.0022
		Inclination     151.4
		AscendingNode   1.23
		Epoch           2454349.083
		ArgOfPericenter 134.8
		MeanAnomaly     0
		//SemiAmplitude   36.254
	}
}

Star "HD 160922 B"
{
	ParentBody "HD 160922"
	Class      ""
	MassSol    1.18
	Teff       5900

	Orbit
	{
		PeriodDays      5.2797766
		Eccentricity    0.0022
		Inclination     151.4
		AscendingNode   1.23
		Epoch           2454349.083
		ArgOfPericenter 314.8
		MeanAnomaly     0
		//SemiAmplitude   44.720
	}
}

// 尚书增二(**)
Star "HD 153697 A"
{
	ParentBody "HD 153697"
	Class      "F2.2V" // F0 F1?
	Teff       6902

	BinaryOrbit
	{
		Separation      76.3801 // 1.13+0.01 Asec
	}
}

Star "HD 153697 B"
{
	ParentBody "HD 153697"
	Class      "G0" // ?

	BinaryOrbit
	{
		Separation      76.3801 // 1.13+0.01 Asec
	}
}

// 天床增一(SB**)
Remove "9 UMi A"{ParentBody "9 UMi"}
Remove "9 UMi B"{ParentBody "9 UMi"}
Star "HD 133621 A"
{
	ParentBody "HD 133621"
	Class      "G0"

	Orbit
	{
		Period          1.2791
		Eccentricity    0.217
		Inclination     51.9
		AscendingNode   307.5
		ArgOfPericenter 10
		Epoch           2447349
		MeanAnomaly     0
	}
}

Star "HD 133621 B"
{
	ParentBody "HD 133621"
	Class      "G5.1 V"

	Orbit
	{
		Period          1.2791
		Eccentricity    0.217
		Inclination     51.9
		AscendingNode   307.5
		ArgOfPericenter 190
		Epoch           2447349
		MeanAnomaly     0
	}
}

// 天床增二(*Pl)
Remove "11 UMi b"{ParentBody "11 UMi"}
Planet	"HD 136726 b"
{
	ParentBody     "HD 136726"
	DiscMethod     "RadVel"
	DiscDate       "2009"
	Mass           3559.677856

	Orbit
	{
		SemiMajorAxis   1.54
		Eccentricity    0.08
		PeriodDays      516.22
		Epoch           2452861.05
		ArgOfPericen    117.63
	}
}

// 大理增二(HB*Pl)
Remove "Meztli"{ParentBody "Tonatiuh"}
Planet	"HIP 58952 b"
{
	ParentBody     "HIP 58952"
	DiscMethod     "RadVel" // radial velocity
	DiscDate       "2003" // Sato et al.,	Okayama Planet Search Program/2003.06.26
	Mass           2637.975554

	Orbit
	{
		//aphelion distance  0.8
		PericenterDist  0.76
		SemiMajorAxis   0.78
		Eccentricity    0.03
		PeriodDays      198.2
		Epoch           2451990
		ArgOfPericenter 310
		MeanAnomaly     0
	}
}

// 六甲增一(a2**?)
Star	"HD 32650 A"
{
	ParentBody     "HD 32650"
	Class          "B9.5VpSi"
	MassSol        3.05
	RadSol         2.9
	Luminosity     110
	Teff           11561
	RotationPeriod 65.59968

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0051793879
		Eccentricity    0
		Inclination     1.19069397
		AscendingNode   0
		ArgOfPericenter 121.772208
		MeanAnomaly     96.4632173
	}
}

Star	"HD 32650 B"
{
	ParentBody     "HD 32650"
	Class          "F8.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0051793879
		Eccentricity    0
		Inclination     1.19069397
		AscendingNode   0
		ArgOfPericenter 301.772208
		MeanAnomaly     96.4632173
	}
}

// 少尉增一(SB**)
Star	"HD 109551 A"
{
	ParentBody     "HD 109551"
	Class          "K2.5III Fe-2"
	RadSol         36
	Luminosity     602.72
	Teff           4210
	FeH            -0.21

	Orbit
	{
		PeriodDays      561.7
		Eccentricity    0.262
		Epoch           2445525.5
		ArgOfPericenter 189
		MeanAnomaly     0
		//SemiAmplitude   6.9
	}
}

Star	"HD 109551 B"
{
	ParentBody     "HD 109551"
	Class          "A8V" // A9V

	Orbit
	{
		PeriodDays      561.7
		Eccentricity    0.262
		Epoch           2445525.5
		ArgOfPericenter 9
		MeanAnomaly     0
	}
}

// 少尉增二(SB**)
Star	"HD 108907 A"
{
	ParentBody     "HD 108907"
	Class          "M3 III"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.414776144
		Eccentricity    0
		Inclination     0.9661901
		AscendingNode   0
		ArgOfPericenter 120.982335
		MeanAnomaly     175.608823
	}
}

Star	"HD 108907 B"
{
	ParentBody     "HD 108907"
	Class          "A3.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.414776144
		Eccentricity    0
		Inclination     0.9661901
		AscendingNode   0
		ArgOfPericenter 300.982335
		MeanAnomaly     175.608823
	}
}

// 上卫增二(PM**?)
Star	"HD 42818 A"
{
	ParentBody     "HD 42818"
	Class          "A0 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          3484.47283
		Eccentricity    0.559911788
		Inclination     1.23614609
		AscendingNode   0
		ArgOfPericenter -110.539933
		MeanAnomaly     122.903053
	}
}

Star	"HD 42818 B"
{
	ParentBody     "HD 42818"
	Class          "K5.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          3484.47283
		Eccentricity    0.559911788
		Inclination     1.23614609
		AscendingNode   0
		ArgOfPericenter 69.4600672
		MeanAnomaly     122.903053
	}
}

// 上丞增二(**)
Star	"HD 23089 A"
{
	ParentBody     "HD 23089"
	Class          "G2II"
	MassSol        5
	RadSol         41
	Luminosity     1150
	Teff           5250
	FeH            -0.28

	Orbit
	{
		PeriodDays      6124
		Eccentricity    0.678
		Inclination     87
		Epoch           2445850.5
		ArgOfPericenter 316.5
		MeanAnomaly     0
		//SemiAmplitude   15.87
	}
}

Star	"HD 23089 B"
{
	ParentBody     "HD 23089"
	Class          "B9V"
	MassSol        4.5
	RadSol         5.3
	Luminosity     708
	Teff           13000

	Orbit
	{
		PeriodDays      6124
		Eccentricity    0.678
		Inclination     87
		Epoch           2445850.5
		ArgOfPericenter 136.5
		MeanAnomaly     0
		//SemiAmplitude   17.6
	}
}

// 上卫增一(bC***)
Remove "Alfirk A"{ParentBody "Alfirk"}
Remove "Alfirk B"{ParentBody "Alfirk"}
Remove "Alfirk Aa"{ParentBody "Alfirk A"}
Remove "Alfirk Ab"{ParentBody "Alfirk A"}
// B为光学伴星
/*Barycenter "HD 205021 A"
{
	ParentBody "HD 205021"
	BinaryOrbit
	{
		Separation      2856 // 13.6"
	}
}*/

Star "HD 205021 Aa"
{
	ParentBody "HD 205021"
	Class      "B1IV"
	MassSol    7.4
	RadSol     5.6
	Luminosity 15100
	Teff       27000
	FeH        -0.23
	Age        0.0087

	Orbit
	{
		PeriodDays      29616.54
		Eccentricity    0.7478
		Inclination     88.8
		AscendingNode   227.83
		Epoch           2450944.5
		ArgOfPericenter 22.43
		MeanAnomaly     0
		//SemiAmplitude   9.63
	}
}

Star "HD 205021 Ab"
{
	ParentBody "HD 205021"
	Class      "B6"
	MassSol    5

	Orbit
	{
		PeriodDays      29616.54
		Eccentricity    0.7478
		Inclination     88.8
		AscendingNode   227.83
		Epoch           2450944.5
		ArgOfPericenter 202.43
		MeanAnomaly     0
	}
}

/*Star "HD 205021 B"
{
	ParentBody "HD 205021"
	Class      "A2"

	BinaryOrbit
	{
		Separation      2856 // 13.6"
	}
}*/

// 少卫增一(SB**)
Star	"HD 208509 A"
{
	ParentBody     "HD 208509"
	Class          "A2V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.846440236
		Eccentricity    0.271291137
		Inclination     -0.219299316
		AscendingNode   0
		ArgOfPericenter 9.79504645
		MeanAnomaly     -25.612325
	}
}

Star	"HD 208509 B"
{
	ParentBody     "HD 208509"
	Class          "K6.2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.846440236
		Eccentricity    0.271291137
		Inclination     -0.219299316
		AscendingNode   0
		ArgOfPericenter 189.795046
		MeanAnomaly     -25.612325
	}
}

// 少卫增八(SB**)
Remove "Errai A"{ParentBody "Errai"}
Remove "Errai B"{ParentBody "Errai"}
Star "HD 222404 A"
{
	ParentBody "HD 222404"
	Class      "K1III-IV CN1"
	MassSol    1.294
	RadSol     4.93
	Luminosity 11.6
	Teff       4792
	FeH        -0.05
	Age        3.25

	Orbit
	{
		Period          67.5
		Eccentricity    0.4112
		Inclination     119.3
		AscendingNode   18.04
		Epoch           2448478.32513933
		ArgOfPericenter 341.01
		MeanAnomaly     0
	}
}

Star "HD 222404 B"
{
	ParentBody "HD 222404"
	Class      "M4V"
	MassSol    0.384

	Orbit
	{
		Period          67.5
		Eccentricity    0.4112
		Inclination     119.3
		AscendingNode   18.04
		Epoch           2448478.32513933
		ArgOfPericenter 161.01
		MeanAnomaly     0
	}
}
//////////ExoPlanets//////////
Remove "Errai A b"{ParentBody "Errai A"}
Planet	"Tadmor/HD 222404 b"
{
	ParentBody     "HD 222404 A"
	DiscMethod     "Astrometry" // Doppler spectroscopy
	DiscDate       "1998" // 	Bruce Campbell/Gordon Walker/Stephenson Yang Hatzes et al. suspected: 1998.07.13/confirmed: 2002.09.24
	Mass           587.982503

	Orbit
	{
		SemiMajorAxis   2.05
		Eccentricity    0.049
		PeriodDays      903.3
		Epoch           2453227
		ArgOfPericen    94.6
		MeanAnomaly     0
	}
}

// 少丞增一(EB***)
Remove "21 Cas (AB)"{ParentBody "21 Cas"}
Remove "21 Cas C"{ParentBody "21 Cas"}
Remove "21 Cas A"{ParentBody "21 Cas (AB)"}
Remove "21 Cas B"{ParentBody "21 Cas (AB)"}
Barycenter "HD 4161 AB"
{
	ParentBody "HD 4161"
	Orbit
	{
		Period          86580
		SemiMajorAxis   541.39408978
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 4161 A"
{
	ParentBody "HD 4161 AB"
	Class      "A1Vm"
	MassSol    2.308
	RadSol     2.547
	Luminosity 41.69
	Teff       9200

	Orbit
	{
		PeriodDays      4.467
		Inclination     88.332
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 4161 B"
{
	ParentBody "HD 4161 AB"
	Class      "F2V"
	MassSol    1.325
	RadSol     1.359
	Luminosity 3.34
	Teff       6890
	Age        0.49

	Orbit
	{
		PeriodDays      4.467
		Inclination     88.332
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HD 4161 C/TYC 4307-2168-1 C"
{
	ParentBody "21 Cas"
	Class      ""
	MassSol    0.8

	Orbit
	{
		Period          86580
		SemiMajorAxis   2458.60591022
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天璇增一(PM**?)
Star "HD 90839 A"
{
	ParentBody "HD 90839"
	Class      "F8V"
	MassSol    1.121
	RadSol     1.091
	Luminosity 1.605
	Teff       6233
	FeH        -0.18
	Age        2.7

	BinaryOrbit
	{
		Separation       1565.55 // 122.5"
	}
}

Star "HD 90839 B"
{
	ParentBody "HD 90839"
	Class      "K7Ve"
	MassSol    0.5605

	BinaryOrbit
	{
		Separation       1565.55 // 122.5"
	}
}

// 辅增一(LP**?)
Star "HD 119228 A"
{
	ParentBody "HD 119228"
	Class      "M2III"
	RadSol     56
	Teff       3684
	FeH        0

	Orbit
	{
		RefPlane        "Equator"
		Period          0.320102964
		SemiMajorAxis   0.253731866
		Eccentricity    0
		Inclination     -0.307570934
		AscendingNode   0
		ArgOfPericenter -72.4495975
		MeanAnomaly     80.2842148
	}
}

Star "HD 119228 B"
{
	ParentBody "HD 119228"
	Class      "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.320102964
		SemiMajorAxis   0.655860158
		Eccentricity    0
		Inclination     -0.307570934
		AscendingNode   0
		ArgOfPericenter 107.550403
		MeanAnomaly     80.2842148
	}
}

// 天枪增一(*Pl?)
Planet	"HD 123782 b(?)"
{
	ParentBody     "HD 123782"
	Mass           9534.8514

	Orbit
	{
		SemiMajorAxis 1.25
		PeriodDays    494
		Eccentricity  0.21
	}
}

// 天枪增二(*Pl)
Remove "24 Boo b"{ParentBody "24 Boo"}
Planet	"HD 127243 b"
{
	ParentBody     "HD 127243"
	DiscMethod     "Astrometry" // Doppler Spectroscopy
	DiscDate       "2018" // Takuya Takarada/Okayama Astrophysical Observatory/2018.04.11
	Mass           289.2238258

	Orbit
	{
		SemiMajorAxis   0.19
		PeriodDays      30.3506
		Eccentricity    0.042
	}
}

// 天枪增三(***)
Barycenter "HD 131041 A"
{
	ParentBody "HD 131041"
	Orbit
	{
		Period          1347.653
		SemiMajorAxis   69.67270195
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 131041 Aa"
{
	ParentBody "HD 131041 A"
	Class      "F8V"
	MassSol    1.29
	FeH        0.06
	Age        1.3

	Orbit
	{
		PeriodDays      12.822
		Eccentricity    0.39
		Epoch           2422379.49
		ArgOfPericenter 277.1
		MeanAnomaly     0
		//SemiAmplitude   58.3
	}
}

Star "HD 131041 Ab"
{
	ParentBody "HD 131041 A"
	Class      ""
	MassSol    1.05

	Orbit
	{
		PeriodDays      12.822
		Eccentricity    0.39
		Epoch           2422379.49
		ArgOfPericenter 97.1
		MeanAnomaly     0
		//SemiAmplitude   72.2
	}
}

Star "HD 131041 B"
{
	ParentBody "HD 131041"
	Class      "F7V"
	MassSol    1.25

	Orbit
	{
		Period          1347.653
		SemiMajorAxis   130.42729805
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天枪增四(EB***)
Remove "44 Boo B"{ParentBody "44 Boo"}
Remove "44 Boo A"{ParentBody "44 Boo"}
Remove "44 Boo Ba"{ParentBody "44 Boo B"}
Remove "44 Boo Bb"{ParentBody "44 Boo B"}
Star "HD 133640 A"
{
	ParentBody "HD 133640"
	Class      "G0Vnv"
	MassSol    1.04
	Luminosity 1.552
	Teff       5877
	FeH        -0.24
	Age        1.4

	Orbit
	{
		Period          209.8
		SemiMajorAxis   25.88954483
		Eccentricity    0.5111
		Inclination     83.55
		AscendingNode   57.14
		Epoch           2455942.04947142
		ArgOfPericenter 219.86
		MeanAnomaly     0
	}
}

Barycenter "HD 133640 B"
{
	ParentBody "HD 133640"
	Orbit
	{
		Period          209.8
		SemiMajorAxis   21.03525517
		Eccentricity    0.5111
		Inclination     83.55
		AscendingNode   57.14
		Epoch           2455942.04947142
		ArgOfPericenter 39.86
		MeanAnomaly     0
	}
}

Star "HD 133640 Ba"
{
	ParentBody "HD 133640 B"
	Class      "K0V"
	MassSol    1.28

	Orbit
	{
		PeriodDays      0.267818
		Eccentricity    0
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   231.31
	}
}


Star "HD 133640 Bb"
{
	ParentBody "HD 133640 B"
	Class      "K4V"

	Orbit
	{
		PeriodDays      0.267818
		Eccentricity    0
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   112.7
	}
}

// 天牢增二(SB***)
Remove "55 UMa A"{ParentBody "55 UMa"}
Remove "55 UMa Aa"{ParentBody "55 UMa A"}
Remove "55 UMa Ab"{ParentBody "55 UMa A"}
Remove "55 UMa B"{ParentBody "55 UMa"}
Barycenter "HD 98353 A"
{
	ParentBody "HD 98353"
	Orbit
	{
		PeriodDays      1872.7
		SemiMajorAxis   1.91689780
		Eccentricity    0.126
		Inclination     64.8
		AscendingNode   130
		Epoch           2448805
		ArgOfPericenter 43.9
		MeanAnomaly     0
		//SemiAmplitude   8.4
	}
}

Star "HD 98353 Aa"
{
	ParentBody "HD 98353 A"
	Class      "A1V"
	MassSol    2
	Teff       9230

	Orbit
	{
		PeriodDays      2.5537985
		Eccentricity    0.323
		Epoch           2449602.368
		ArgOfPericenter 296.8
		MeanAnomaly     0
		//SemiAmplitude   79.1
	}
}

Star "HD 98353 Ab"
{
	ParentBody "HD 98353 A"
	Class      "A2 V"
	MassSol    1.8
	Teff       8810

	Orbit
	{
		PeriodDays      2.5537985
		Eccentricity    0.323
		Epoch           2449602.368
		ArgOfPericenter 116.8
		MeanAnomaly     0
		//SemiAmplitude   79.1
	}
}

Star "HD 98353 B"
{
	ParentBody "HD 98353"
	Class      "A1V"
	MassSol    2.1
	Teff       9290

	Orbit
	{
		PeriodDays      1872.7
		SemiMajorAxis   3.46867220
		Eccentricity    0.126
		Inclination     64.8
		AscendingNode   130
		Epoch           2448805
		ArgOfPericenter 223.9
		MeanAnomaly     0
		//SemiAmplitude   8.4
	}
}

// 势增二(SB**)
Star "HD 92168 A"
{
	ParentBody "HD 92168"
	Class      "G0IV"
	MassSol    1.68
	Luminosity 11.32
	Teff       6106
	FeH        0.32
	Age        2.03

	Orbit
	{
		PeriodDays      7.7991499
		Eccentricity    0.023
		EpochHJD        20165.164
		ArgOfPericenter 105.56
		MeanAnomaly     0
		//SemiAmplitude   24.1
	}
}

Star "HD 92168 B"
{
	ParentBody "HD 92168"
	Class      ""
	MassSol    0.31

	Orbit
	{
		PeriodDays      7.7991499
		Eccentricity    0.023
		EpochHJD        20165.164
		ArgOfPericenter 285.56
		MeanAnomaly     0
	}
}

// 势增四(SB**)
Remove "BET LMi B"{ParentBody "BET LMi"}
Remove "BET LMi A"{ParentBody "BET LMi"}
Star "HD 90537 1" // 防冲突
{
	ParentBody "HD 90537"
	Class      "G9III"
	MassSol    2.98
	RadSol     9.4
	LumBol     50.7
	Teff       4097
	FeH        0.09
	Age        1.2

	Orbit
	{
		PeriodDays      13965
		Eccentricity    0.68
		Inclination     81.4
		Epoch           2451411.1
		ArgOfPericenter 35.7
		MeanAnomaly     0
		//SemiAmplitude   7.93
	}
}

Star "HD 90537 B"
{
	ParentBody "HD 90537"
	Class      "F8IV"
	MassSol    1.92
	RadSol     3.7
	LumBol     9.1
	Teff       5211

	Orbit
	{
		PeriodDays      13965
		Eccentricity    0.68
		Inclination     81.4
		Epoch           2451411.1
		ArgOfPericenter 215.7
		MeanAnomaly     0
		//SemiAmplitude   12.32
	}
}

// 文昌增三(**)
Star	"HD 81104 A"
{
	ParentBody     "HD 81104"
	Class          "A2Vnp"

	Orbit
	{
		RefPlane        "Equator"
		Period          31.7413201
		Eccentricity    0.671609282
		Inclination     0.222706556
		AscendingNode   0
		ArgOfPericenter -83.067262
		MeanAnomaly     141.514001
	}
}

Star	"HD 81104 B"
{
	ParentBody     "HD 81104"
	Class          "G8.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          31.7413201
		Eccentricity    0.671609282
		Inclination     0.222706556
		AscendingNode   0
		ArgOfPericenter 96.932738
		MeanAnomaly     141.514001
	}
}

// 文昌增五(PM**)
Star	"HD 80290 A"
{
	ParentBody     "HD 80290"
	Class          "F3V"

	BinaryOrbit
	{
		Separation      167.01 // 5.78"
	}
}

Star	"HD 80290 B"
{
	ParentBody     "HD 80290"
	Class          "G4 V"

	BinaryOrbit
	{
		Separation      167.01 // 5.78"
	}
}

// 文昌增六(**)
Star	"HD 80608 A"
{
	ParentBody     "HD 80608"
	Class          "B9"

	BinaryOrbit
	{
		Separation      1009.47 // 6.29"
	}
}

Star	"HD 80608 B"
{
	ParentBody     "HD 80608"
	Class          "F8"

	BinaryOrbit
	{
		Separation      1009.47 // 6.29"
	}
}

// 内阶增一(SB***)
Barycenter "内阶增一/19 Lyn A/HD 57103/HIP 35785/HR 2784/SAO 26312"
{
	ParentBody "19 Lyn"
	BinaryOrbit
	{
		Separation      93794.93013542
	}
}

Star "19 Lyn Aa"
{
	ParentBody "19 Lyn A"
	Class      "B8V"
	MassSol    3.33
	Luminosity 166
	Teff       12078

	Orbit
	{
		PeriodDays      2.2596
		Eccentricity    0.08
		AscendingNode   126.1
		Epoch           2419031.632
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   106.4
	}
}

Star "19 Lyn Ab"
{
	ParentBody "19 Lyn A"
	Class      "F9.8 V"

	Orbit
	{
		PeriodDays      2.2596
		Eccentricity    0.08
		AscendingNode   126.1
		Epoch           2419031.632
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   199.1
	}
}

Star "19 Lyn B/GC 9799/HD 57102/HIP 35783/HR 2783/SAO 26311"
{
	ParentBody "19 Lyn"
	Class      "B9V"
	MassSol    3.03
	Luminosity 127.9
	Teff       10691

	/*BinaryOrbit
	{
		Separation      93794.93013542
	}*/
}

// 内阶增七(PM*Pl)
Remove "4 UMa b"{ParentBody "4 UMa"}
Planet	"HD 73108 b"
{
	ParentBody     "HD 73108"
	DiscMethod     "RadVel"
	DiscDate       "2007"
	Mass           2256.581498

	Orbit
	{
		SemiMajorAxis   0.87
		PeriodDays      269.3
		Eccentricity    0.432
	}
}

// 内阶增十(SB**)
Remove "TAU UMa B"{ParentBody "TAU UMa"}
Remove "TAU UMa A"{ParentBody "TAU UMa"}
Star "HD 78362 A"
{
	ParentBody "HD 78362"
	Class      "kA5hF0mF5II"
	MassSol    1.8
	Luminosity 16
	Teff       7343
	FeH        0.57

	Orbit
	{
		PeriodDays      1062.4
		Eccentricity    0.48
		Epoch           2425721.6
		ArgOfPericenter 169.4
		MeanAnomaly     0
		//SemiAmplitude   3.9
	}
}

Star "HD 78362 B"
{
	ParentBody "HD 78362"
	Class      "F5.8 V"

	Orbit
	{
		PeriodDays      1062.4
		Eccentricity    0.48
		Epoch           2425721.6
		ArgOfPericenter 349.4
		MeanAnomaly     0
	}
}

// 三师增一(**)
Star "HD 78154 A/TYC 4141-1496-1"
{
	ParentBody "HD 78154"
	Class      "F6IV"
	MassSol    1.31
	RadSol     1.75
	Teff       6276
	FeH        -0.03

	Orbit
	{
		Period          970
		Eccentricity    0.801
		Inclination     145.4
		AscendingNode   102.1
		Epoch           2421371.87535680
		ArgOfPericenter 152.4
		MeanAnomaly     0
	}
}

Star "HD 78154 B/TYC 4141-1496-2"
{
	ParentBody "HD 78154"
	Class      "K2V"

	Orbit
	{
		Period          970
		Eccentricity    0.801
		Inclination     145.4
		AscendingNode   102.1
		Epoch           2421371.87535680
		ArgOfPericenter 332.4
		MeanAnomaly     0
	}
}

// 八谷增一(**)
Star "HD 30121 A" // Ab和B是同一颗星?
{
	ParentBody "HD 30121"
	Class      "A3m"
	MassSol    2.01
	RadSol     2.57
	Luminosity 17.64
	Teff       7700
	FeH        0.27
	Age        0.56

	Orbit
	{
		Period          90
		Eccentricity    0.87
		Inclination     120
		AscendingNode   54.5
		ArgOfPericenter 55.9
		MeanAnomaly     0
	}
}

Star "HD 30121 B"
{
	ParentBody "HD 30121"
	Class      "F3.1 V"

	Orbit
	{
		Period          90
		Eccentricity    0.87
		Inclination     120
		AscendingNode   54.5
		ArgOfPericenter 235.9
		MeanAnomaly     0
	}
}

// 八谷增三(**)
Star "HD 30958 A"
{
	ParentBody "HD 30958"
	Class      "B9.5V"
	MassSol    2.15
	RadSol     5.1
	Luminosity 226
	Teff       9931
	Age        0.277

	BinaryOrbit
	{
		Separation      3044.4
	}
}

Star "HD 30958 B"
{
	ParentBody "HD 30958"
	Class      "M1.1 V"

	BinaryOrbit
	{
		Separation      3044.4
	}
}

// 八谷增十一(*?)
Remove "16 Cam A"{ParentBody "16 Cam"}
Remove "16 Cam B"{ParentBody "16 Cam"}

// 八谷增十二(EB***)
Barycenter "HD 34233 A"
{
	ParentBody "HD 34233"
	Orbit
	{
		RefPlane        "Equator"
		Period          4219.39494
		SemiMajorAxis   123.038756
		Eccentricity    0.541206777
		Inclination     1.80374968
		AscendingNode   0
		ArgOfPericenter -85.5011333
		MeanAnomaly     -106.667073
	}
}

Star "HD 34233 Aa"
{
	ParentBody "HD 34233 A"
	Class      "B5V"
	Luminosity 220.01

	Orbit
	{
		PeriodDays      6.6784
		Eccentricity    0.48
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 34233 Ab"
{
	ParentBody "HD 34233 A"
	Class      "B"

	Orbit
	{
		PeriodDays      6.6784
		Eccentricity    0.48
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HD 34233 B"
{
	ParentBody     "HD 34233"
	Class          "B"

	Orbit
	{
		RefPlane        "Equator"
		Period          4219.39494
		SemiMajorAxis   376.775479
		Eccentricity    0.541206777
		Inclination     1.80374968
		AscendingNode   0
		ArgOfPericenter 94.4988667
		MeanAnomaly     -106.667073
	}
}

// 八谷增十三(RS**)
Star "HD 32357 A"
{
	ParentBody "HD 32357"
	Class      "K0IIIe"
	MassSol    1.1
	RadSol     23.08
	Luminosity 212

	Orbit
	{
		PeriodDays      80.9
		Eccentricity    0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 32357 B"
{
	ParentBody "HD 32357"
	Class      ""
	MassSol    0.6

	Orbit
	{
		PeriodDays      80.9
		Eccentricity    0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 八谷增十四(*) 两颗伴星均为光学伴星
Remove "BET Cam A"{ParentBody "BET Cam"}
Remove "BET Cam B"{ParentBody "BET Cam"}

// 八谷增十六(**?)
Star	"HD 37136 A"
{
	ParentBody     "HD 37136"
	Class          "A5 V"
	RadSol          3.121
	Luminosity      35.66
	Teff            7619

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00862612326
		Eccentricity    0
		Inclination     -0.319100857
		AscendingNode   0
		ArgOfPericenter -117.410681
		MeanAnomaly     -109.531694
	}
}

Star	"HD 37136 B"
{
	ParentBody     "HD 37136"
	Class          "A8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00862612326
		Eccentricity    0
		Inclination     -0.319100857
		AscendingNode   0
		ArgOfPericenter 62.5893193
		MeanAnomaly     -109.531694
	}
}

// 八谷增廿五(***?)
Barycenter "HD 43812 A"
{
	ParentBody "HD 43812"
	BinaryOrbit
	{
		Separation      122.93 // 0.98"
	}
}

Star "HD 43812 Aa"
{
	ParentBody "HD 43812 A"
	Class      "A2Vp"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00396921718
		Eccentricity    0
		Inclination     1.10191369
		AscendingNode   0
		ArgOfPericenter 18.9623943
		MeanAnomaly     -154.50747
	}
}

Star "HD 43812 Ab"
{
	ParentBody "HD 43812 A"
	Class      "F7.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00396921718
		Eccentricity    0
		Inclination     1.10191369
		AscendingNode   0
		ArgOfPericenter 198.962394
		MeanAnomaly     -154.50747
	}
}

Star	"HD 43812 B"
{
	ParentBody     "HD 43812"
	Class          "K3.2 V"

	/*BinaryOrbit
	{
		Separation      122.93 // 0.98"
	}*/
}

// 八谷增廿六(EB**)
Remove "2 Lyn A"{ParentBody "2 Lyn"}
Remove "2 Lyn B"{ParentBody "2 Lyn"}
Star "HD 43378 1"
{
	ParentBody "HD 43378"
	Class      "A2Vs"
	MassSol    2.32
	RadSol     2.2
	Luminosity 39.5
	Teff       9310
	RotationPeriod 37.44

	Orbit
	{
		PeriodDays      1306.82
		Eccentricity    0.497
		Epoch           2450962
		ArgOfPericenter 6.3
		MeanAnomaly     0
		//SemiAmplitude   3.281
	}
}

Star "HD 43378 2"
{
	ParentBody "HD 43378"
	Class      ""
	MassSol    0.46

	Orbit
	{
		PeriodDays      1306.82
		Eccentricity    0.497
		Epoch           2450962
		ArgOfPericenter 186.3
		MeanAnomaly     0
	}
}

// 八谷增廿八(*Pl)
Remove "6 Lyn b"{ParentBody "6 Lyn"}
Planet	"HD 45410 b"
{
	ParentBody     "HD 45410"
	DiscMethod     "Astrometry" // Doppler spectroscopy
	DiscDate       "2008" // Sato et al./Okayama Astrophysical Observatory/2008
	Mass           638.8350438 // 2.01MJ
	Radius         86433.828 // 1.209RJ

	Orbit
	{
		SemiMajorAxis   2.11
		Eccentricity    0.073
		PeriodDays      934.3
		Epoch           2455384
		ArgOfPericen    130
		MeanAnomaly     0
	}
}

// 八谷增廿九(**?)
Star	"HD 49618 A"
{
	ParentBody     "14 Lyn"
	Class          "G8III"

	Orbit
	{
		RefPlane        "Equator"
		Period          10854.0609
		Eccentricity    0.736722231
		Inclination     0.658064365
		AscendingNode   0
		ArgOfPericenter -173.686883
		MeanAnomaly     6.23124395
	}
}

Star	"HD 49618 B"
{
	ParentBody     "14 Lyn"
	Class          "F5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          10854.0609
		Eccentricity    0.736722231
		Inclination     0.658064365
		AscendingNode   0
		ArgOfPericenter 6.31311695
		MeanAnomaly     6.23124395
	}
}

// 八谷增三十(**)
Remove "15 Lyn A"{ParentBody "15 Lyn"}
Remove "15 Lyn B"{ParentBody "15 Lyn"}
Star "HD 50522 1"
{
	ParentBody "HD 50522"
	Class      "G5 III"
	RadSol     8
	Luminosity 40
	Teff       5164
	FeH        0.05

	Orbit
	{
		Period          262
		Eccentricity    0.74
		Inclination     78
		AscendingNode   43.4
		Epoch           2448870.96050302
		ArgOfPericenter 278
		MeanAnomaly     0
	}
}

Star "HD 50522 2"
{
	ParentBody "HD 50522"
	Class      "F8V"

	Orbit
	{
		Period          262
		Eccentricity    0.74
		Inclination     78
		AscendingNode   43.4
		Epoch           2448870.96050302
		ArgOfPericenter 98
		MeanAnomaly     0
	}
}

// 八谷增卅四(SB**)
Remove "45 Aur A"{ParentBody "45 Aur"}
Remove "45 Aur B"{ParentBody "45 Aur"}
Star "HD 43905 A"
{
	ParentBody "HD 43905"
	Class      "F5V"
	MassSol    1.2
	Luminosity 21.72
	Teff       6489
	FeH        0.23
	Age        1.561

	Orbit
	{
		PeriodDays      6.5011
		Eccentricity    0
		Epoch           2444496.869
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   32
	}
}

Star "HD 43905 B"
{
	ParentBody "HD 43905"
	Class      ""
	MassSol    0.42

	Orbit
	{
		PeriodDays      6.5011
		Eccentricity    0
		Epoch           2444496.869
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 传舍增二(***)
Star "HD 24480 A"
{
	ParentBody "HD 24480"
	Class      "K4III"
	RadSol     90
	Luminosity 1854
	Teff       3986

	/*BinaryOrbit
	{
		Separation      495.9 // 1.71"
	}*/
}

Barycenter "HD 24480 B"
{
	ParentBody "HD 24480"
	BinaryOrbit
	{
		Separation      495.9 // 1.71"
	}
}

Star "HD 24480 Ba"
{
	ParentBody "HD 24480 B"
	Class      "A"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.121911324
		Eccentricity    0
		Inclination     -1.0737381
		AscendingNode   0
		ArgOfPericenter -144.521974
		MeanAnomaly     -54.8538409
	}
}

Star	"HD 24480 Bb"
{
	ParentBody     "HD 24480 B"
	Class          "A8.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.121911324
		Eccentricity    0
		Inclination     -1.0737381
		AscendingNode   0
		ArgOfPericenter 35.4780264
		MeanAnomaly     -54.8538409
	}
}

// 天棓增二(**)
Star	"HD 162579 A"
{
	ParentBody     "HD 162579"
	Class          "A2V"

	Orbit
	{
		RefPlane        "Equator"
		Period          4.36469925
		Eccentricity    0.184528694
		Inclination     -0.249964237
		AscendingNode   0
		ArgOfPericenter 21.3735331
		MeanAnomaly     -121.808626
	}
}

Star	"HD 162579 B"
{
	ParentBody     "HD 162579"
	Class          "F4.2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          4.36469925
		Eccentricity    0.184528694
		Inclination     -0.249964237
		AscendingNode   0
		ArgOfPericenter 201.373533
		MeanAnomaly     -121.808626
	}
}

// 天棓增九(****)
Remove "MU Dra AB"{ParentBody "Arrakis"}
Remove "MU Dra C"{ParentBody "Arrakis"}
Remove "MU Dra A"{ParentBody "MU Dra AB"}
Remove "MU Dra B"{ParentBody "MU Dra AB"}
Remove "MU Dra Ba"{ParentBody "MU Dra B"}
Remove "MU Dra Bb"{ParentBody "MU Dra B"}
Barycenter "HIP 83608 AB"
{
	ParentBody "HIP 83608"
	BinaryOrbit
	{
		Separation      361.68 // 13.2"
	}
}

Star "Alrakis/HR 6370/HD 154906 A"
{
	ParentBody "HIP 83608 AB"
	Class      "F7V"
	MassSol    1.35
	FeH        -0.01

	Orbit
	{
		Period          812
		Eccentricity    0.5139
		Inclination     142.2
		AscendingNode   282.85
		Epoch           2431890.85068169
		ArgOfPericenter 13.31
		MeanAnomaly     0
	}
}

Barycenter "HR 6369/HD 154905 B"
{
	ParentBody "HIP 83608 AB"
	Orbit
	{
		Period          812
		Eccentricity    0.5139
		Inclination     142.2
		AscendingNode   282.85
		Epoch           2431890.85068169
		ArgOfPericenter 193.31
		MeanAnomaly     0
	}
}

Star "HD 154905 Ba"
{
	ParentBody "HD 154905 B"
	Class      ""
	MassSol    1.3
	Age        2.2

	Orbit
	{
		PeriodDays      2270
		Eccentricity    0.4
		Inclination     83.5
		AscendingNode   134.1
		ArgOfPericenter 272.6
		Epoch           2420645.043381
		MeanAnomaly     0
	}
}

Star "HD 154905 Bb"
{
	ParentBody "HD 154905 B"
	Class      ""
	MassSol    0.2

	Orbit
	{
		PeriodDays      2270
		Eccentricity    0.4
		Inclination     83.5
		AscendingNode   134.1
		ArgOfPericenter 92.6
		Epoch           2420645.043381
		MeanAnomaly     0
	}
}

Star "HIP 83608 C"
{
	ParentBody "HIP 83608"
	Class      ""
	MassSol    0.29

	/*BinaryOrbit
	{
		Separation      361.68 // 13.2"
	}*/
}

// 天棓增十(SB***Pl)
Remove "26 Dra (AB)"{ParentBody "26 Dra"}
Remove "26 Dra C"{ParentBody "26 Dra"}
Remove "26 Dra A"{ParentBody "26 Dra (AB)"}
Remove "26 Dra B"{ParentBody "26 Dra (AB)"}
Barycenter "天棓增十/26 Dra AB/HD 160269/HIP 86036/HR 6573/LHS 3305/LTT 15223/SAO 17546"
{
	ParentBody "CCDM J17351+6152"
	BinaryOrbit
	{
		Separation      10470.8
	}
}

Star "26 Dra A/HIP 86036 A/HD 160269 A"
{
	ParentBody "26 Dra AB"
	Class      "F9V"
	MassSol    1.3
	Teff       6000
	FeH        -0.18
	Age        8.4

	Orbit
	{
		Period          76.1
		Eccentricity    0.18
		Inclination     104
		AscendingNode   151
		Epoch           2432186.69686271
		ArgOfPericenter 127
		MeanAnomaly     0
	}
}

Star "26 Dra B/HIP 86036 B/HD 160269 B"
{
	ParentBody "26 Dra AB"
	Class      "K3V"
	MassSol    0.83

	Orbit
	{
		Period          76.1
		Eccentricity    0.18
		Inclination     104
		AscendingNode   151
		Epoch           2432186.69686271
		ArgOfPericenter 307
		MeanAnomaly     0
	}
}

Star "HIP 86037/GJ 685 C/LTT 15224"
{
	ParentBody "CCDM J17351+6152"
	Class      "M1V"

	/*BinaryOrbit
	{
		Separation      10470.8
	}*/
}

//////////ExoPlanets//////////
Remove "Gliese 685 b"{ParentBody "Gliese 685"}
Planet	"GJ 685 b"
{
	ParentBody     "GJ 685 C"
	DiscMethod     "RadVel"
	DiscDate       "2019"
	Mass           9

	Orbit
	{
		SemiMajorAxis   0.1344
		PeriodDays      24.16
	}
}
